public class RCalc{
    public static void main(String[] args){
        if(args[0].equalsIgnoreCase("add")){
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);

            System.out.println(num1 + num2);
        }

        else if(args[0].equalsIgnoreCase("subtract")){
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);

            System.out.println(num1 - num2);
        }
         else if(args[0].equalsIgnoreCase("multiply")){
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);

            System.out.println(num1 * num2);
        }





    }
    
}
