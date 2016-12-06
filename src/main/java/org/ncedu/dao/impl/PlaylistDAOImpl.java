package org.ncedu.dao.impl;

import org.ncedu.dao.PlaylistDAO;
import org.ncedu.entity.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by nick on 16.11.16.
 */
@Repository
public class PlaylistDAOImpl implements PlaylistDAO {
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    public void addPlaylist(Playlist playlist) {
        hibernateTemplate.save(playlist);
    }
}
