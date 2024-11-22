package no.dependency.injection;
/**
 * O código de cliente que usará a classe Application para enviar mensagens de e-mail será como abaixo.
 * @author alexs
 *
 */
public class MyApplication {
    // Classe está responsável por criar e inicializar o serviço de e-mail, para posteriormente utilizá-lo.
    // Isso leva à "dependência codificada"
    private ServicoMensagem servico;

    public MyApplication(ServicoMensagem servico) {
        this.servico = servico;
    }

    public void processarMensagem(String mensagem, String destinatario){
        //aqui teríamos algumas mensagens de validação, manipulação da lógica, etc.
        this.servico.enviarMensagem(mensagem, destinatario);
    }

}
