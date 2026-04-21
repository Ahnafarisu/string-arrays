    import java.util.Scanner;
    //Home Task
    //Task-1
    public class stringquizpractice{
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your string: ");
            String s1 = sc.nextLine();
            int uppercase = 0, lowercase = 0, digits = 0;
            String converted = "";
            for(int i = 0; i<s1.length(); i++){
                if(s1.charAt(i)>= 'A' && s1.charAt(i)<='Z'){
                    uppercase++;
                    converted += (char)(s1.charAt(i) + 32);
                }
                else if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z'){
                    lowercase++;
                    converted += (char)(s1.charAt(i) - 32);
                }
                else if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9'){
                    digits++;
                    converted += s1.charAt(i);
                }

                //else statement is not necessary
                //Unicode values



            }
            System.out.print(" Uppercase Letters: " + uppercase);
            System.out.print(" Lowercase letters: " + lowercase);
            System.out.println(" digits: " + digits);
            System.out.println("Converted string: " + converted);Ab






            System.out.println("Unicode Values: ");
            for(int i = 0; i<s1.length(); i++){
                System.out.println(s1.charAt(i) + "-->" + s1.codePointAt(i));
            } 


        }
    }