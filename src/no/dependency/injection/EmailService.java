package no.dependency.injection;

/**
 * Classe contém a lógica para enviar uma mensagem de e-mail para o endereço de e-mail do destinatário.
 * @author alexs
 *
 */
public class EmailService implements ServicoMensagem {

    public void enviarMensagem(String mensagem, String destinatario){
        // Neste ponto teríamos a lógica (conjunto de instruções) para enviar um email
        System.out.println("Email enviado para "+destinatario+ " com a mensagem: "+mensagem);
    }
}