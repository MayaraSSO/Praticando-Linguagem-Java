# Praticando-Linguagem-Java
Projetos que fazem parte do meu caminho de aprendizagem em Java


## Classes e seus componentes
    
   ###Identificadores 
    Exemplo de identificadores válidos
    int _a;
    int $c; 
    int _______2_w; 
    int _$; 
    int um_nome_bem_detalhado_de_identificador; 
     
    Exemplos de identificadores inválidos; 
        int ;b;     Só podem começar com caracter de $ _ ou letras
        int –d;     Só podem começar com caracter de $ _ ou letras
        int e#;     Só podem começar com caracter de $ _ ou letras
        int .f;     Só podem começar com caracter de $ _ ou letras
        int 7g;     Só podem começar com caracter de $ _ ou letras
      
        um bom exercício é identificar os motivos pelos quais os identificadores
        acima são inválidos!
        
            Classes: – Os identificadores devem ter a primeira letra maiúscula.
            – Os identificadores devem ser substativos;
         


         
    ### Métodos: 
            Os identificadores de METODOS devem ter a primeira letra minúscula e o formato “camelCase” deve ser utilizado.
            – Os identificadores devem ser do tipo verbo-substativo;
        

        
            Variáveis: – como os métodos, os identificadores devem ter a primeira letra minúscula e o formato “camelCase” deve ser utilizado.
            – A Sun recomenda que os identificadores devem ser curtos e significativos;
         */

         /*
                Constantes: – Constantes em Java são feitas modificando variáveis como estáticas e finais.
                – Elas devem usar letras maiúsculas e underscore como separador de caracteres.
          */

         /*
                // Exemplo de classe valida 
                    class MinhaClasse {   }
          */


          /*
                Os modificadores são divididos em duas classes: 
                • Modificadores de acesso – public, protected, private; 
                • Outros modificadores – incluindo final e abstract;
                
                • Modificador public: 
                    • Todos conseguem acessar e manipular;
                • Modificador default: 
                    • Apenas quem está no pacote acessa e manipular
           */


           /*
                // Exemplo de variaveis
                    //Variáveis são componentes da classe que apresentam valores e estão associados ao estado atual de uma instância da classe.

                    public int idade; 
                    double peso; 
                    private float altura; 
                    char sexo;
                    Pessoa pai;

                            Para declarar uma variável: 
                             <modificadores acesso> <outros modificadores> TIPO IDENTIFICADOR;
            */



            /*
                    Constante é um tipo especial de variável que tem seu valor compartilhado por todos os objetos que pertencem aquela classe e seu valor não pode ser alterado;
                        Para declarar uma constante:   
                            <modificadores acesso> static final TIPO IDENTIFICADOR;

                        // Exemplo de constantes
                                public static final double NOTA_MINIMA = 5.0; 
                                static final int LIMITE_ALUNOS = 25;
                                static final float PI = 3.14159265f;
             */


             /*
                    Para declarar um método utilizamos a seguinte estrutura: 
                        
                        <modificadores acesso> <outros modificadores> TIPO_DE_RETORNO 
                        ASSINATURA { 
                            // corpo do método
                        } 
                    
                    A ASSINATURA é composta de: 
                        IDENTIFICADOR(<parâmetros>)
                            Onde: <parâmetros> conjunto de variáveis separadas por vírgulas que serão manipuladas durante a execução do método;
                            Todo parâmetro tem um tipo e um identificador próprio. 
                                Por exemplo: int idade;
                        O TIPO_DE_RETORNO é o tipo que será retornado ao final da execução do comportamento.
                            Por exemplo: int ou void(isto é, não retorna nada!)
              */

              /*
                        Os tipos de retorno representam uma forma que uma instância (objeto) da classe tem para apresentar o resultado do comportamento.
                            Regra #9 : Todo método apresenta um tipo de retorno e uma ou mais chamadas a keyword return no seu corpo.
                                A única exceção para a Regra #9 é quando o método não retornar resultado. Neste caso: 
                                    • O tipo de retorno deve ser declarado como void.
                                    • e não aparecem chamadas a keyword return no seu corpo.
               */


               /*
                        Parâmetros : Representam o que o método deve receber quando é invocado. 
                            Por exemplo: 
                             public int somar(int numero1, int numero2);
                        • Argumentos : Representam o que você especificou entre parênteses para invocar o método. 
                            Por exemplo: 
                             somar(1,2);
                        Parâmetros são opcionais, 
                        logo:
                            public void retornaMedia() { }
                        É um método valido!
                */

                /*
                        Construtores são métodos especiais que são chamados quando uma instância de uma classe é criada, isto é, quando um objeto daquela classe é criado. 
                        Para declarar um construtor de uma classe:

                            public NOME_DA_CLASSE(<parâmetros>){ 
                                    // corpo do construtor
                            }

                        Regra #10 : Construtores NÃO tem tipo de retorno!
                        Note que NÃO é possível utilizar modificadores em métodos construtores.
                 */
                    