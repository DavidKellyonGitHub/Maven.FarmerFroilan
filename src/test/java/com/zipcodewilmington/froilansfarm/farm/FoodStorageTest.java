package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.food.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

public class FoodStorageTest {

    FoodStorage storage = new FoodStorage();

    @Test
    public void getStoreTest(){
        Map<String , ArrayList<Edible>> mapTest = storage.getStore();
        Assert.assertFalse(mapTest.isEmpty());
    }
    @Test
    public void storeCarrot() {
        Carrot carrot = new Carrot();
        storage.storeCarrot(carrot);
        Assert.assertEquals(1, storage.carrotAmount());
    }

    @Test
    public void storeOnion() {
        Onion onion = new Onion();
        storage.storeOnion(onion);
        Assert.assertEquals(1, storage.onionAmount());
    }

    @Test
    public void storeEgg() {
        Egg egg = new Egg();
        storage.storeEgg(egg);
        Assert.assertEquals(1, storage.eggAmount());
    }

    @Test
    public void storePotato() {
        Potato potato = new Potato();
        storage.storePotato(potato);
        Assert.assertEquals(1, storage.potatoAmount());
    }

    @Test
    public void storeTomato() {
        Tomato tomato = new Tomato();
        storage.storeTomato(tomato);
        Assert.assertEquals(1, storage.tomatoAmount());
    }

    @Test
    public void storeEarCorn() {
        EarCorn earCorn = new EarCorn();
        storage.storeEarCorn(earCorn);
        Assert.assertEquals(1, storage.earCornAmount());
    }

    @Test
    public void removeCarrot() {
        Carrot carrot = new Carrot();
        storage.storeCarrot(carrot);
        storage.removeCarrot();
        Assert.assertEquals(0, storage.carrotAmount());
    }

    @Test
    public void removeOnion() {
        Onion onion = new Onion();
        storage.storeOnion(onion);
        storage.removeOnion();
        Assert.assertEquals(0, storage.onionAmount());
    }

    @Test
    public void removeEgg() {
        Egg egg = new Egg();
        storage.storeEgg(egg);
        storage.removeEgg();
        Assert.assertEquals(0, storage.eggAmount());
    }

    @Test
    public void removePotato() {
        Potato potato = new Potato();
        storage.storePotato(potato);
        storage.removePotato();
        Assert.assertEquals(0, storage.potatoAmount());
    }

    @Test
    public void removeTomato() {
        Tomato tomato = new Tomato();
        storage.storeTomato(tomato);
        storage.removeTomato();
        Assert.assertEquals(0, storage.tomatoAmount());
    }

    @Test
    public void removeEarCorn() {
        EarCorn earCorn = new EarCorn();
        storage.storeEarCorn(earCorn);
        storage.removeEarCorn();
        Assert.assertEquals(0, storage.earCornAmount());
    }
}
