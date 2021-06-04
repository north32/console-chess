# Консольный интерфейс к проекту шахматы

Данный репозиторий содержит cli версию проекта шахматы.

#  Как запустить

Склонируйте проект и синхонизируйте gradle зависимости. Сконфигурируйте 11 Java sdk. Затем скомпилируйте и запустите результат.

# Как играть

После запуска проекта, вы сможете выбрать вашего оппонента.

````
please choose game mode:
1) player vs player
2) player vs bot
3) bot vs bot
````

После выбора оппонента начинается игра. 

Команды для взаимодействия с доской:
````
help - print help info
move e2e4 - makes move
check e2e4 - check if move is legal
moves - prints all legal moves
````

