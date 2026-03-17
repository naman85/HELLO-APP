public class UC5 {

    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder names = new StringBuilder();
            boolean first = true;
            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }
            System.out.println("Hello " + names.toString() + "!");

        } else {
            System.out.println("Hello World!");
        }
    }
}