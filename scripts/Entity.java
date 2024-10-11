// Declaração do Pacote de Código
package JAVARuntime;

// Importações Úteis (Explícitas da ITsMagic Engine)
import JAVARuntime.Component;
import JAVARuntime.SpatialObject;
import JAVARuntime.AsyncTask;
import JAVARuntime.AsyncRunnable;

// Importações Úteis (Explicitas do Jogo Padrão)
import JAVARuntime.EntityAnimation;

// Importações Úteis (Explícitas do Java)
import java.lang.Object;
import java.lang.String;

@ClassCategory(cat = "Object")
// Classe que Representa uma Entidade
public class Entity extends Component
{
    // Campo Privado dos Pontos de Vida (o Valor Padrão é 20.0)
    private float healthPoints = 20.0f;
    
    // Campo Privado da Lista de Animações
    private ArrayList<EntityAnimation> animations = new ArrayList<EntityAnimation>();
    
    // Campo Privado do Nome de Exibição (Caso Vazío, um Nome Padrão será Definido)
    private String displayName;
    
    // Construtor Público Vazío
    public Entity()
    {
        // Construtor da Classe Herdada
        super();
    }
    
    // Construtor Público com Nome (Exibição)
    public Entity(String newDisplayName)
    {
        // Construtor da Classe Herdada
        super();
        
        // Caso o Nome não estiver Vazío
        if(newDisplayName != "")
        {
            // Define o Valor da Variável do Nome de Exibição
            this.displayName = newDisplayName;
        }
        else
        {
            // Define o Valor da Variável do Nome de Exibição
            this.displayName = "New Entity";
        }
    }
    
    // Função de Instância (Retorna um Tipo "String" do Nome de Componente)
    public String getComponentTittle()
    {
        // Retorna uma Nova Instância de "String"
        return "Entity";
    }
    
    // Função de Instância (Retorna um Tipo "String" do Menu de Componente)
    public String getComponentMenu()
    {
        // Retorna uma Nova Instância de "String"
        return "/Brutu's Arena/Components/";
    }
    
    // Função de Instância (Retorna um Tipo "String" do Nome de Exibição)
    public String getDisplayName()
    {
        // Retorna uma Instância Existente de "String"
        return this.displayName;
    }
    
    // Função de Definir o Valor do Nome de Exibição
    public void setDisplayName(String newDisplayName)
    {
        // Muda o Nome de Exibição
        this.displayName = newDisplayName;
    }
    
    // Função de Instância (Retorna um Tipo "Inteiro" dos Pontos de Vida)
    public float getHealthPoints()
    {
        // Retorna os Pontos de Vida Atuais
        return this.healthPoints;
    }
    
    // Função para Mudar os Pontos de Vida
    public void setHealthPoints(float value)
    {
        // Caso os Pontos de Vida sejam Mais que 0.0
        if(this.healthPoints > 0.0f)
        {
            // Muda o Valor dos Pontos de Vida para um Novo Valor
            this.healthPoints = value;
        }
    }
    
    // Função Pública para Obter a Lista Atual de Animações
    public ArrayList<EntityAnimation> getAnimationList()
    {
        // Retorna a Lista de Animações
        return this.animations;
    }
    
    @Override
    // Função Inicial (Executa em um Único Quadro)
    public void start()
    {
        
    }
    
    @Override
    // Função de Repetição (Executa para todos Quadros)
    public void repeat()
    {
        
    }
    
    // Função para Matar a Entidade
    public void kill()
    {
        // Define os Pontos de Vida para 0.0
        this.setHealthPoints(0.0f);
    }
    
    // Função de Instância (Retorna o Tipo "EntityAnimation" da Lista de Animações)
    public EntityAnimation getAnimationByIndex(int index)
    {
        // Retorna a Lista de Animações
        return animations.get(index);
    }
}
