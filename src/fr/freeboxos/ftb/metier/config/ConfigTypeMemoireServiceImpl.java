/*
 * Copyright (C) 2020 alan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.freeboxos.ftb.metier.config;

import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.RestServerLocalConfiguration;
import fr.freeboxos.ftb.metier.entitys.config.ConfigTypeMemoire;
import fr.freeboxos.ftb.metier.sort.Sort;
import fr.freeboxos.ftb.metier.sort.config.ComparatorByIdConfigTypeMemoire;
import java.util.List;
import lml.rest.client.ClientRest;

public class ConfigTypeMemoireServiceImpl extends ClientRest<ConfigTypeMemoire> implements ConfigTypeMemoireService {

    public ConfigTypeMemoireServiceImpl() {
        super.init("ConfigTypeMemoireService", new RestServerLocalConfiguration());
    }

    @Override
    public ConfigTypeMemoire[] sort() throws Exception {
        ConfigTypeMemoire[] configTypeMemoires = this.getAll().toArray(new ConfigTypeMemoire[0]);
        ComparatorByIdConfigTypeMemoire cmp = new ComparatorByIdConfigTypeMemoire();
        Sort trieuse = MetierFactory.getSortSerivce();
        trieuse.sort(configTypeMemoires, cmp);

        return configTypeMemoires;
    }

    @Override
    public ConfigTypeMemoire add(ConfigTypeMemoire t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(ConfigTypeMemoire t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(ConfigTypeMemoire t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public ConfigTypeMemoire getById(Long l) throws Exception {
        super.setPath("" + l);
        return super.getEntity();
    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<ConfigTypeMemoire> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<ConfigTypeMemoire> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

    @Override
    public ConfigTypeMemoire getByTypeMemoire(String s) throws Exception {
        super.setPath("type/" + s);
        return super.getEntity();
    }

}
