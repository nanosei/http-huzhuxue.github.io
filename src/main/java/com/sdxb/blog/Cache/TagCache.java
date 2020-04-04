package com.sdxb.blog.Cache;

import com.sdxb.blog.dto.TagDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TagCache {
    public List<TagDto> gettags(){
        List<TagDto> tags=new ArrayList<>();

        TagDto Grate=new TagDto();
        Grate.setCategoryname("年级");
        Grate.setTags(Arrays.asList("小学一年级","小学二年级","小学三年级","小学四年级","小学五年级","小学六年级","初一","初二","初三","高一","高二","高三"));
        tags.add(Grate);

        TagDto subject=new TagDto();
        subject.setCategoryname("学科");
        subject.setTags(Arrays.asList("语文","数学","英语","政治","历史","地理","物理","化学","生物"));
        tags.add(subject);

        return tags;
    }
}
