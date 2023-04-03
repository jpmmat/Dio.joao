package Dio.ultimo.projeto.Dio.joao;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerateType.AUTO)
        private long id;
        private String nome;
        @ManyToOne
        private Endereco endereco;

        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public Endereco getEndereco() {
            return endereco;
        }
        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
        
        




    
    
}
