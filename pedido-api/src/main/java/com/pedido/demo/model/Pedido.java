package com.pedido.demo.model;

public class Pedido {
    private Long id;
    private String produto;
    private int quantidade;
    private double valorTotal;

    private Pedido(Builder builder) {
        this.id = builder.id;
        this.produto = builder.produto;
        this.quantidade = builder.quantidade;
        this.valorTotal = builder.valorTotal;
    }

    
    public Long getId() {
		return id;
	}

	public String getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public static class Builder {
        private Long id;
        private String produto;
        private int quantidade;
        private double valorTotal;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder produto(String produto) {
            this.produto = produto;
            return this;
        }

        public Builder quantidade(int quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public Builder valorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}

