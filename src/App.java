public class App {
    public static void main(String[] args)  {
        Integer number = null;
        while(number == null){
            System.out.println("Digite um número para construir a pirâmide: ");
            String entry = System.console().readLine();
            try{
                number = Integer.parseInt(entry);
            }
            catch(NumberFormatException nfe){
                System.out.println("entrada inválida");
            }
        }
        for(int i = 1; i <= number; i++){
            String line = "" + i;
            for(int j = 1; j < i; j++){
                line += i;
            }
            System.out.println(line);
        }

    }
}
