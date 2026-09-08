class pgm2 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "Java";

        if (s1 == s2) {
            System.out.println("Reference are equal");
        } else {
            System.out.println("Reference are not Equal");
        }
        if (s1.equalsIgnoreCase(s2)){
            System.out.println(" Strings are Equal");
        }else{
            System.out.println(" String are Not Equal");
        }
    }
}
