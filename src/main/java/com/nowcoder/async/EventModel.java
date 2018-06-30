package com.nowcoder.async;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nowcoder on 2016/7/14.
 */
public class EventModel {
    private EventType type; //活动类型
    private int actorId;  //触发者
    private int entityId; //触发对象id
    private int entityType; //触发对象类型
    private int entityOwnerId; //触发对象拥有者
    private Map<String, String> exts = new HashMap<>(); //触发现场哪些信息都保存下来

    public Map<String, String> getExts() {
        return exts;
    }
    public EventModel() {

    }
    public EventModel(EventType type) {
        this.type = type;
    }

    public String getExt(String name) {
        return exts.get(name);
    }

    public EventModel setExt(String name, String value) {
        exts.put(name, value);
        return this;
    }

    public EventType getType() {
        return type;
    }

    public EventModel setType(EventType type) {
        this.type = type;
        return this;
    }

    public int getActorId() {
        return actorId;
    }

    public EventModel setActorId(int actorId) {
        this.actorId = actorId;
        return this;
    }

    public int getEntityId() {
        return entityId;
    }

    public EventModel setEntityId(int entityId) {
        this.entityId = entityId;
        return this;
    }

    public int getEntityType() {
        return entityType;
    }

    public EventModel setEntityType(int entityType) {
        this.entityType = entityType;
        return this;  //注意这里的小技巧，链路的方式
    }

    public int getEntityOwnerId() {
        return entityOwnerId;
    }

    public EventModel setEntityOwnerId(int entityOwnerId) {
        this.entityOwnerId = entityOwnerId;
        return this;
    }
}
