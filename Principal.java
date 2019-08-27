/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAR 10 OBJETOS DA CLASS ALUNO USANDO O
        //CONSTRUTOR CHEIO
        Aluno aluno01 = new Aluno(111,"Joao", "1111-1111");
        Aluno aluno02 = new Aluno(222,"Ana", "2222-2222");
        Aluno aluno03 = new Aluno(333,"Maria", "3333-3333");
        Aluno aluno04 = new Aluno(444,"Jose", "4444-4444");
        Aluno aluno05 = new Aluno(555,"Antonio", "5555-5555");
        Aluno aluno06 = new Aluno(666,"Joaquim", "6666-6666");
        Aluno aluno07 = new Aluno(777,"Rosa", "7777-7777");
        Aluno aluno08 = new Aluno(888,"Silvia", "8888-8888");
        Aluno aluno09 = new Aluno(999,"Francisco", "9999-9999");
        Aluno aluno10 = new Aluno(100,"Rodrigo", "1010-1010");
        
        //OBJETO 'ListaAlunos' Pertence 'a Classe ArrayList
        //Instanciando uma lista vazia só recebera objetos da
        //classe Aluno
        //Classe TIPADA ArrayList<T>
        ArrayList<Aluno> listaAluno  = new ArrayList<>();
        
        //ADICIONANDO 10 OBJETOS DA CLASSE Aluno
        //na lista Instanciada usando o método add()
        listaAluno.add(aluno01);
        listaAluno.add(aluno02);
        listaAluno.add(aluno03);
        listaAluno.add(aluno04);
        listaAluno.add(aluno05);
        listaAluno.add(aluno06);
        listaAluno.add(aluno07);
        listaAluno.add(aluno08);
        listaAluno.add(aluno09);
        listaAluno.add(aluno10);
        //listaAluno.add("Aluno11"); ERRO - Lista Tipada
        //NAO ACEITA STRING
        
        //Instanciar 5 Objetos da Classe Aluno
        //e adicionar na ListaAlunos
        //usando um laco FOR
        
        for (int j = 11; j <= 15; j++){
            Aluno objAluno = new Aluno(j, "aluno"+j, "9999-"+j+j);
            listaAluno.add(objAluno);
        }
       //******* NAO "DEVO" DECLARAR DENTRO DO LACO FOR*******
       Aluno objAluno = new Aluno();
       for (int i = 0; i < listaAluno.size(); i++){
            objAluno = listaAluno.get(i);
            if (objAluno.getIdAluno() == 999){
                System.out.println("ENCONTREI o " + objAluno.getNome());
            }
            System.out.println("Aluno" + objAluno.getIdAluno() + " - " +
                                         objAluno.getNome() + " - " +
                                         objAluno.getCelular());
            
        }
       
        //Novos Objetos definindo FORA DO FOR
        //Teremos a referencia a um UNICO objeto (GLOBAL)
        //nesse caso teremos de colocar o objeto dentro do laco for
        
        Aluno objAluno1 = new Aluno();
        for (int j = 11; j <= 15; j++){
            objAluno1.setIdAluno(j);
            objAluno1.setNome("novo-aluno"+j);
            objAluno1.setCelular("XXX-"+j+j);
            listaAluno.add(objAluno1);
            
        }
     
        //LEITURA DOS OBJETOS ADICIONADOS DENTRO DA LISTA
        //USANDO O LAÇO FOR
        
        //METODO size RETORNA O TAMANHO DA LISTA
        //METODO GET(index) Retorna o elemento da posicao INDEX
        for(int i = 0; i < listaAluno.size(); i++){
            System.out.println("Aluno"+listaAluno.get(i).getIdAluno()+ " - " + listaAluno.get(i).getNome());
            
        }
        
      
        
    }

   
    }
    

