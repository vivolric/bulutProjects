package JavaTechnoStudy.day31.classModifiers.packageTwo;

import JavaTechnoStudy.day31.classModifiers.packageOne.PublicModifierClass;

public class OtherPackageClass {

    public static void main(String[] args) {
//        ClassWithDefaultModifier sample1 = new ClassWithDefaultModifier();  // bu default oldugundan cagiramiyoruz
        PublicModifierClass sample2 = new PublicModifierClass();
    }
}
