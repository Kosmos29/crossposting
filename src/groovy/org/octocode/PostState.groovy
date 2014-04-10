package org.octocode
public enum PostState {
    NotPublished('Не опубликовано'),
    Published('Опубликовано'),
    InProgress('Ожидает проверки'),
    Failure('Не опубликовано из-за недоступности блогов'),
    Error('Ошибка')

    final String name

    PostState(String name)
    {
        this.name = name
    }
}