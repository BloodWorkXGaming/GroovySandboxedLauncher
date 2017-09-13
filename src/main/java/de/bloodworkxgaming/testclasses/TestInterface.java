package de.bloodworkxgaming.testclasses;

import de.bloodworkxgaming.groovysandboxedlauncher.annotations.GSLWhitelistConstructor;
import de.bloodworkxgaming.groovysandboxedlauncher.annotations.GSLWhitelistMember;

@GSLWhitelistConstructor
public class TestInterface {
    // public int magic = 200;
    public static int testInt = 99;
    public static int[] testArray = {29, 20, 19};

    @GSLWhitelistMember
    public int getMagic() {
        return 2;
    }

}