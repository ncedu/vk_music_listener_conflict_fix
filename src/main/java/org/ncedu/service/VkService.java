package org.ncedu.service;

import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.audio.AudioFull;
import org.ncedu.entity.MessageMusic;
import org.ncedu.entity.Music;

import java.io.IOException;
import java.util.List;
import java.io.IOException;

/**
 * Created by nick on 01.12.16.
 */
public interface VkService {
    Music getAudio (String uid, String room_id, String link, String name, String author) throws IOException;
    MessageMusic[] searchAudio (String uid, String query) throws ClientException, ApiException;
    MessageMusic[] getAudioList (int uid) throws ClientException, ApiException;
    MessageMusic[] generateArray (List<AudioFull> audioFulls);
}
