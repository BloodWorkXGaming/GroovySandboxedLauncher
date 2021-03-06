package de.bloodworkxgaming.groovysandboxedlauncher.defaults

import de.bloodworkxgaming.groovysandboxedlauncher.annotations.GSLWhitelistClass
import de.bloodworkxgaming.groovysandboxedlauncher.annotations.GSLWhitelistConstructor
import de.bloodworkxgaming.groovysandboxedlauncher.annotations.GSLWhitelistMember
import de.bloodworkxgaming.groovysandboxedlauncher.sandbox.WhitelistRegistry
import groovy.transform.BaseScript
import groovy.transform.CompileStatic
import org.codehaus.groovy.runtime.GStringImpl

@CompileStatic
class WhitelistDefaults {
    static void registerWhitelistMethodDefaults(WhitelistRegistry registry) {

        registry.with {
            // ----------- Annotations ----------------------
            registerAnnotation(GSLWhitelistClass)
            registerAnnotation(GSLWhitelistConstructor)
            registerAnnotation(GSLWhitelistMember)
            registerAnnotation(BaseScript)

            // ------------- Script natives ------------------
            registerMethod(Script.class, "println")
            registerMethod(Script.class, "print")
            registerMethod(Script.class, "printf")

            registerMethod(GroovyObject.class, "println")
            registerMethod(GroovyObject.class, "print")
            registerMethod(GroovyObject.class, "printf")
            registerMethod(Object.class, "with", Closure)
            registerMethod(Closure.class, "call")

            // --------- Useful collections ---------
            registerWildCardMethod(List.class)
            registerWildCardMethod(Map.class)
            registerWildCardMethod(Set.class)

            registerConstructorCall(ArrayList.class, HashSet.class, HashMap.class)

            // --------- basic types --------------
            registerAllMethodsAndFields(String.class)
            registerAllMethodsAndFields(Boolean.class)
            registerAllMethodsAndFields(Long.class)
            registerAllMethodsAndFields(Integer.class)
            registerAllMethodsAndFields(Short.class)
            registerAllMethodsAndFields(Byte.class)
            registerAllMethodsAndFields(Double.class)
            registerAllMethodsAndFields(Float.class)

            registerAllMethodsAndFields(GString.class)

            //registerMethod(Object.class, "toString")
            registerWildCardMethodWithoutClass("toString", false)
            registerWildCardMethodWithoutClass("equals", false)
            registerWildCardMethodWithoutClass("hashCode", false)
            registerWildCardMethodWithoutClass("getClass", false)
            registerWildCardMethodWithoutClass("asBoolean", false)

            // ----------- Useful helper classes -------
            registerAllMethodsAndFields(Math.class)
        }

    }

}
