// Declaração do Pacote de Código
package JAVARuntime;

// Importações Úteis (Explícitas da ITsMagic Engine)
import JAVARuntime.Component;
import JAVARuntime.SpatialObject;
import JAVARuntime.AsyncTask;
import JAVARuntime.AsyncRunnable;

// Importações Úteis (Explícitas do Jogo Padrão)
import JAVARuntime.Player;

// Importações Úteis (Explícitas do Java)
import java.lang.String;
import java.util.ArrayList;

// Serviço Útil para Jogadores se Conectarem e serem Jogáveis
public class PlayerService
{
    // Campo Privado para Lista de Jogadores Atívos
    static private ArrayList<Player> players;
    
    // Campo Privado para Referência de Objeto Relacionado
    static private SpatialObject relatedObject;
    
    // Construtor Privado (Aqui, todas as Funções e Campos são Estáticos)
    private PlayerService()
    {
        // Construtor da Classe Herdada
        super();
    }
    
    // Função Estática de Início Principal
    public static void main(String[] args)
    {
        // Muda o Objeto Relacionado
        relatedObject = WorldController.findObject("Players Service");
        
        // Percorre por todos os Jogadores
        for(Player player : players)
        {
            // Muda o Personagem do Jogador
            player.character = player.myObject.findChildObject("Character");
        }
    }
    
    // Função Estática de Obter a Lista de Jogadores
    static public ArrayList<Player> getPlayerList()
    {
        // Retorna a Lista de Jogadores
        return players;
    }
    
    // Função de Obter um Jogador por Índice da Lísta
    static public Player getPlayerByIndex(int index)
    {
        // Retorna o Jogador Selecionado
        return players.get(index);
    }
}
