// Declaração do Pacote de Código
package JAVARuntime;

// Importações Úteis (Explícitas da ITsMagic Engine)
import JAVARuntime.Component;
import JAVARuntime.SpatialObject;
import JAVARuntime.AsyncTask;

// Importações Úteis (Explícitas do Jogo Padrão)
import JAVARuntime.Entity;

// Importações Úteis (Explícitas do Java)
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

@ClassCategory(cat = "Object")
// Classe que Representa um Jogador (Entidade Jogável)
public class Player extends Entity
{
    // Campo Público para a Lista de Membros do Personagem
    public ArrayList<SpatialObject> members = new ArrayList<SpatialObject>();
    
    // Campo Público para o Personagem do Jogador
    public SpatialObject character = null;
    
    // Construtor Público (Vazío)
    public Player()
    {
        // Construtor da Classe Herdada
        super("Guest Player");
    }
    
    // Construtor Público (um Nome Padrão será Definido)
    public Player(String newDisplayName)
    {
        // Construtor da Classe Herdada
        super(newDisplayName);
        
        // Caso o Novo Nome de Exibição não esteja Vazío
        if(newDisplayName != "")
        {
            // Muda o Nome de Exibição
            this.setDisplayName(newDisplayName);
        }
    }
    
    @Override
    // Função Inicial (Executa em um Único Quadro)
    public void start()
    {
        // Obtenha e Adiciona as Animações do Jogador
        this.getAnimationList().add(new EntityAnimation(new ArrayList<EntityKeyframe>()));
        this.getAnimationByIndex(0).keyframes.add(new EntityKeyframe(0.0f, null));
    }
    
    @Override
    // Função de Repetição (Executa para todos Quadros)
    public void repeat()
    {
        
    }
    
    // Função para Expulsar o Jogador
    public void kick(String message, int exitCode)
    {
        // Mata e Destrua o Jogador
        this.kill();
        this.myObject.destroy();
    }
    
    // Função de Instância (Retorna um Tipo "String" do Título de Componente)
    public String getComponentTittle()
    {
        // Retorna uma Nova Instância de "String"
        return "Player Entity";
    }
}
