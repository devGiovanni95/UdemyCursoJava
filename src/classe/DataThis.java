package classe;

public class DataThis {

    int dia;
    int mes;
    int ano;

    DataThis() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        //em vez de colocar as datas assim podemos fazer desta forma
    this(1,1,1970);
    }

    DataThis(int diaInicial, int mesInicial, int anoInicial){
        this.dia = dia ;
        this.mes = mes;
        this.ano = ano;
    }

//variavel local e quando declaramos ela dentro de um metodo
    // assim podemos utilizar ela para ter uma função especifica, por exemplo:

    String obterDataFormatada() {
       final String formato = "%d/%d/%d";  //colocando o final na frente ela vira uma constante local
        //a variavel local so pode ser usada depois da sua criação e valendo apenas ate o final do seu metodo
        //para podermos usa ela em qualquer metodo precisamos colocar elça fora do metodo deixando dentro da classe
        // ae poderiamos utilizar ela em qualquer metodo, podendo colocar ela ate no final do codigo que os metodos
        // conseguem acessar ela mesmo assim(pois ela se torna uma variavel de instancia podendo ser acessada por qualquer metodo)
        return String.format(formato,this.dia,mes,ano);
    }
//    String obterDataFormatada() {
//        return String.format("%d/%d/%d", this.dia,mes,ano);
//    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }
}
