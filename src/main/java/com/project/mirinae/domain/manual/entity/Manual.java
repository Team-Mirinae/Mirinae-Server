package com.project.mirinae.domain.manual.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter @NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "manual")
public class Manual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx;

    private String title;

    private String content;

    private String category;

    @Builder
    public Manual(String title, String content, String category) {
        this.title = title;
        this.content = content;
        this.category = category;
    }

    @Builder
    public Manual(int idx, String title, String content, String category) {
        this.idx = idx;
        this.title = title;
        this.content = content;
        this.category = category;
    }
}
