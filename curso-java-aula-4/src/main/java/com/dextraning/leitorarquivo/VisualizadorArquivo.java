package com.dextraning.leitorarquivo;

public abstract class VisualizadorArquivo {

	public void abrirArquivo(String caminho) {
		verificarSeArquivoExiste(caminho);
		verificarPermissaoArquivo(caminho);
		verificarTamanho(caminho);
		lerDadosArquivo(caminho);
		mostrarArquivoNaTela();
	}

	private void mostrarArquivoNaTela() {
	}

	private void verificarTamanho(String caminho) {
	}

	private void verificarPermissaoArquivo(String caminho) {
	}

	private void verificarSeArquivoExiste(String caminho) {
	}

	protected abstract void lerDadosArquivo(String caminho);
}
