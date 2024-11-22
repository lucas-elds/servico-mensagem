package no.dependency.injection;

public class SmsService implements ServicoMensagem {

    public void enviarMensagem(String mensagem, String destinatario){
        // Neste ponto teríamos a lógica (conjunto de instruções) para enviar um SMS
        System.out.println("SMS enviado para "+destinatario+ " com a mensagem: "+mensagem);
    }
}
