CREATE TABLE tarefa (
    id BIGSERIAL PRIMARY KEY,
    data_atualizacao TIMESTAMP(6),
    data_criacao TIMESTAMP(6),
    descricao VARCHAR(255),
    nome VARCHAR(255),
    observacoes VARCHAR(255),
    status VARCHAR(255)
);