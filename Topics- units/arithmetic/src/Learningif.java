class Learningif {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "agastya";

        System.out.println("before if");
        if (isMale) {
            System.out.println("mr. " + name);
        }
        else {
            System.out.println("ms." + name);

        }
        System.out.println("after if");


        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;

        if(isSeniorCitizen) {
            System.out.println("hello senior citizen");
        }
        else {
            if (isAnAdult) {
                System.out.println("hello adult");
            } else{
                System.out.println("hello child");
            }
        }


    }
}


