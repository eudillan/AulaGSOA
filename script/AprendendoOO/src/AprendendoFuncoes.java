import static javax.swing.JOptionPane.showMessageDialog;
//exibir mensagens
import static javax.swing.JOptionPane.showInputDialog;
//receber dados do usuario

//Converter string - int
import static java.lang.Integer.parseInt;
//converter string - float
import static java.lang.Float.parseFloat;
public class AprendendoFuncoes{
    public static void main(String[] args) {
        int n1 = parseInt(showInputDialog("Digite n1"));
        int n2 = parseInt(showInputDialog("Digite n2"));
        int resultado = calculaSoma (3, 5);
        showMessageDialog(null, resultado);
        
    }//main
    
    //somar dois números int
    public static int calculaSoma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }
}//class