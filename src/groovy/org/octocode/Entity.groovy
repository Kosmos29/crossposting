package org.octocode

class Entity {
    Boolean deleted = false
    public void _delete(Map map = [:])
    {
        deleted = true;
        this.save(map);
    }
}
