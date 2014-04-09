package org.octocode

abstract class VirtualDeletable {
    Boolean deleted = false
    public void vDelete(Map map = [:])
    {
        deleted = true;
        this.save(map);
    }
}
