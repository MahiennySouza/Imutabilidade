package Imutabilidade;

public class Main {
    public static void main(String[] args){

        Cidade cidade = new Cidade("Palmas");
        System.out.println("Cidade mutável: " + cidade.getNome());
        System.out.println();


          CidadeRecord cidadeRecord = new CidadeRecord("Goiânia");
        System.out.println("CidadeRecord: " + cidadeRecord.nome());
        System.out.println();

          PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("Mahienny", cidade);
        System.out.println("PessoaRecordShallow: " + pessoaShallow);
        pessoaShallow.cidade().setNome("São Paulo"); 
        System.out.println();

         PessoaRecord p = new PessoaRecord("Jhon", cidadeRecord);
        System.out.println("\nPessoaRecord: " + p);
    }
    
}
