package br.com.brunotadashi.gestaovagas.exceptions;

public class UserFoundException extends RuntimeException {
  public UserFoundException() {
    // Chama o construtor da classe pai (RuntimeException)
    super("Usuário já existe");
  }
}
