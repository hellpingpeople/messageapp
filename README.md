# messageapp
для СКБ-ЛАБС

Приложение для отправки сообщений на Apache Service Mix 
1. Был празвёрнут Apache Service Mix версии 6.1.3 с установленным Apache Camel

2. Написано простое приложение для формирования и отправки файла, с помощью CamelContext 
из папки ../apache-servicemix-6.1.3/camel/outbox/ в папку 
../apache-servicemix-6.1.3/camel/inbox/



3. Из папки ../apache-servicemix-6.1.3/camel/inbox/
уже средствами apache Camel происходит передача файла в папку
../apache-servicemix-6.1.3/camel/outbox/

4. Для работы у себя необходимо будет указать свои пути с установленными Apache Service Mix и Camel


TODO: В будущем будет возможность устанавливать любые пути, системные переменные итд


P.S. Если у Вас не linux, скорее всего нужно будет изменить пути на свои

