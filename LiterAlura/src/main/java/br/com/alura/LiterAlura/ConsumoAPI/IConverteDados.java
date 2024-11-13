package br.com.alura.LiterAlura.ConsumoAPI;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}