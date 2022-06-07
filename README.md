# ms-configuration

Repositorio responsavel por ler os dados do repo de configurações dos ms


### Exemplo da chamada para realizar a leitura do arquivo de configuração.
 
    protocolo://host:porta/ms-configuration/default
                               [nome-ms] / [profile]   

### Payload obtido

```
{
	"name": "ms-configuration",
	"profiles": [
		"default"
	],
	"label": null,
	"version": "versao",
	"state": null,
	"propertySources": [
		{
			"name": "https://github.com/MaxwellJalves/ms-properties-conf/ms-configuration.properties",
			"source": {
				"teste.config": "Obtendo value da propriedade ms-configuration DEV"
			}
		}
	]
}
````
