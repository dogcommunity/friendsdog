package company.friendsdog.dogcommunity.entity;

import company.friendsdog.dogcommunity.dto.request.PetBoardRequestDTO;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private Long petNo;
    private Long boardNo;
    private String title;
    private String content;
    private LocalDateTime boardDateTime;
    private String attachedImg;
    private Long likes;
    private Long hits;

    public Board(PetBoardRequestDTO dto) {
        this.petNo = dto.getPetNo();
        this.title = dto.getTitle();
        this.content = dto.getContent();
        this.attachedImg = dto.getAttachedImg();
        this.boardDateTime = LocalDateTime.now();
        this.boardNo = dto.getBoardNo();
        this.likes = dto.getLikes();
    }
}
