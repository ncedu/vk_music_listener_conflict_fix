package org.ncedu.service;

import org.ncedu.entity.Music;
import java.util.List;
/**
 * Created by nick on 16.11.16.
 */
public interface MusicService {
    Music getMusicById (Long id);
    List<Music> getMusicByRoom (Long room_id);
}
