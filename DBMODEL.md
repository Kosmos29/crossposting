# Описание модели данных #
--------------------------

**user** (пользователь)<br/> 
id, login, pass, role(bool?) ролей немного и модератор - урезанный администратор, мб достаточно одного поля для указания уровня доступа

**site** (сайт)<br/>
id, title?, url здесь хранятся все сайты, без указания типа (продвигаемый/продвигающий)

## продвигаемый сайт ##

**promotionSite**<br/>
id, siteId, projectId (для связи с project)


**promotionText**<br/>
id, value, state, promotionSiteId текст статьи (state - Не опубликованое, Опубликованое, Ожидает проверки)

**promotionUrl**<br/>
id, promotionSiteId, chance список ссылок на него с возможностью задать процентное соотношение


**anchor**<br/>
id, type, text, promotionUrlId, chance список анкоров для каждой ссылки в отдельности с процентовкой использования для каждого анкора

## продвигающий сайт ##

**promotingSite** (данные для подключения к db)<br/>
id, ip, port, login, pass, siteId, projectId

**project** (проект)<br/>
id, title