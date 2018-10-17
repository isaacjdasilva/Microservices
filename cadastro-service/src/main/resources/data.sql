INSERT INTO tb_pessoa (nome, ic_pessoa) VALUES ('Isaac Silva', 'F');
INSERT INTO tb_pessoa (nome, ic_pessoa) VALUES ('Coca-Cola', 'J');
INSERT INTO tb_pessoa_fisica (cpf, id_pessoa) VALUES ('99999999999', (select id_pessoa from tb_pessoa where nome = 'Isaac Silva'));
INSERT INTO tb_pessoa_juridica (cnpj, id_pessoa) VALUES ('12345678901234', (select id_pessoa from tb_pessoa where nome = 'Coca-Cola'));