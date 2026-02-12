# Sistema de controle de versão

- Configuração inicial para uso do Git
	– Configuração de nome de usuário e e-mail no Git
```bash
git config --global user.name <seu nome aqui>
git config --global user.email <seu email aqui>
```

– Criando Personal Access Token (PAT) no GitHub

	1. Entre na página inicial do GitHub
	1. No canto superior direito clique na foto do seu perfil
	1. Na aba que abrir acesse _settings_. 
	1. Na aba da esquerda nas configurações, vá na última opção de _Developter Settings_.
	1. Acesse _Personal ACess Tokens_
	1. escolha a opção _classic_
	1. Clique no botão _generate new token_. 
	1. Selecione as opções desejadas, como as opções _repo_ para que esse token possa trabalhar com seus repositórios, por exemplo
	1. No final da página, conclua o processo
	1. Uma tela aparecerá para escolher o tempo desejado
	1. Em seguida, o token será apresentado para ser copiado
	
	– Salvar em cache as credenciais do PAT
```bash
git config --global credential.helper 'cache --timeout=<tempo desejado em segundos>'
```

- Qual a diferença entre git merge e git rebase?
Git merge junta uma branch desejada a sua branch atual, nisto, criando uma mensagem de commit adicional apenas para o merge das duas branches, preferível para grandes projetos facilitando localizar o próprio merge. Já o rebase não cria uma mensagem de commit, a junção das branches só é feita quando um commit do usuário é enviado
