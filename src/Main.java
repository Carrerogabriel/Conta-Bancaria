import javax.swing.*;

public class Main {
    public static void main(String[] args) {

  String nome = "Gabriel Carrero Zomer";
  String tipoConta = "Corrente";
  double saldoConta = 2500.00;
  int opcao = 0;

        while (opcao != 4) {
            String menu = """
    ---- DIGITE SUA OPCAO -----
    1 - Consultar saldo
    2 - Transferir valor
    3 - Receber valor
    4 - Sair""";

     try {
         opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
     "----------------------------------------\n" + "Nome do cliente: " + nome +"\n"
             +"Tipo da conta: " + tipoConta + "\n" + "\n"
             + "----------------------------------------\n" + menu));

    switch (opcao) {
        case 1:
            JOptionPane.showMessageDialog(null, "Seu saldo é: " + saldoConta);
            break;
        case 2:
            double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Qual valor você quer transferir?"));
  if (valorTransferencia > saldoConta) {
      JOptionPane.showMessageDialog(null, "Não há saldo suficiente para fazer a transação");
  } else {
      saldoConta -= valorTransferencia;
      JOptionPane.showMessageDialog(null, "Seu novo saldo é: " + saldoConta);
  }
       break;
   case 3:
       double valorRecebido = Double.parseDouble(JOptionPane.showInputDialog("Valor recebido:"));
       saldoConta += valorRecebido;
       JOptionPane.showMessageDialog(null, "Seu novo saldo é: " + saldoConta);
       break;
   case 4:
       break;
   default:
      JOptionPane.showMessageDialog(null, "Opção inválida");
      break;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
    }
        }
    }
}
