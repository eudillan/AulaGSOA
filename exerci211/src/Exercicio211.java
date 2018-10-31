import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;


public class Exercicio211{
public static void main(String[] args){
    int qtdConvidados = 20;
    int[] idades = new int [qtdConvidados];
    
    for (int contador = 0; contador < qtdConvidados; contador++){
        idades[contador] = receberInt(
                "CONTROLE DE CONVIDADOS\n: " +
                "Digite a idade do " + (contador + 1 ) + "° convidado: "
        );
    }
    String resposta = "LISTA FINAL DE CONVIDADOS\n";
    
    for (int cont = 0; cont < idades.length; cont++){
        resposta += "idade: " + idades[cont] + "  - Situação: " + validaConvidado(idades[cont]) + "\n";
        
    }
    exibir(resposta);
    
    //innt idadeConvidado = receberInt("Digite sua idade: ");
    //exibir(""
    //exibir(valueOf(idadeConvidado));
   
   
}
public static int receberInt(String mensagemProUsuario){
    String aux = showInputDialog(mensagemProUsuario);
        
    try {
        return parseInt(aux);    
    } catch (Exception e) {
        exibir("Você digitou alro errado :(");
        return 0;
            }
    
}


    public static void exibir(String mensagemProUsuario){
            showMessageDialog(null, mensagemProUsuario);
                    }
    public static String validaConvidado(int idadeConvidado){
     String msg = "";
     
    if (idadeConvidado >= 15 && idadeConvidado <= 17){
        msg = "Você pode entrar na festa";
    }
    else{
        msg = "Sai fora bicão!!!";
    }
    return msg;
    }
}

