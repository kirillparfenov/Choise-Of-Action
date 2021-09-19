package com.game.choice_of_action.example.backpack;

import lombok.Data;

@Data
public class Container {

  private Item item;
  private Long freeSlots;

  protected void resize(int newSize) {

  } // увеличиваем или уменьшаем контейнер <Items[]>. Старые вещи из старого массива копируются в новый. Те что не влезают — остаются для нашего Garbage Collector.
  private void recalcFreeSlots() {

  } // получаем свободные слоты рекалькулируя переменную freeSlots[] каждый раз, когда вещь добавляется или убирается из контейнера.
  protected boolean hasSpace() {
    return false;
  } //проверяем есть ли свободные слоты в инвентаре
  protected boolean hasItem(Item item) {
    return false;
  } //поиск вещи в <Items[]>
  /*protected Item lastItem() {

  } //получить последнюю вещь из <Items[]>
  protected Item peekByItem(Item item) {

  } // получить вещь по Item, мы будем использовать сравнение item == items[i]
  protected Item peekByItemId(int id) {

  } // получить вещь из массива по её ID, используем id == items[i].getId()
  protected Item peekByObjectId(int objectId) {

  } // получить вещь из массива по её Object ID или UID (как удобнее)
  protected boolean add(Item item) {

  } // добавить вещь в контейнер
  private void remove(Item removeable) {

  } // убрать вещь из контейнера вне зависимости от кол-ва и т.д.
  protected void destroy(Item item, int count) {

  } // удалить вещь из контейнера или уменьшить кол-во вещей если сама вещь stacakble
  protected int count(Item item) {

  } // получить кол-во вещей*/
}
