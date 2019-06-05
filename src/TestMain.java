public class TestMain {

    public static void main(String[] args) {

        System.out.println("Hello World");
        String str1 = args[0];
        int marks = Integer.parseInt(str1);

        switch (marks){
            case 90:
                System.out.println("mark : "+marks+" is A");
                break;
            case 80:
                System.out.println("mark : "+marks+" is B");
                break;
            case 70:
                System.out.println("mark : "+marks+" is C");
                break;
            default:
                System.out.println("Mark : "+marks+" is FAIL");
        }

    }

}
