package com.nt.rxjava2retroft2.bean;

import java.util.List;

/**
 * HuangPengHua
 * 2019-04-08
 */
public class News {

    /**
     * date : 20190408
     * stories : [{"images":["https://pic4.zhimg.com/v2-bce58bcbb271e0b5b39282365393824b.jpg"],"type":0,"id":9709943,"ga_prefix":"040810","title":"贫血、停经、肠胃感染\u2026\u2026吃素食真的会对身体有害吗？"},{"images":["https://pic3.zhimg.com/v2-3ec50c1f229fa6910b55dc12502c76ea.jpg"],"type":0,"id":9710008,"ga_prefix":"040807","title":"在 IT 行业，拿 50~100 万年薪"},{"images":["https://pic4.zhimg.com/v2-bce98d86603da7e9324bf69884e8e3b7.jpg"],"type":0,"id":9709824,"ga_prefix":"040806","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic4.zhimg.com/v2-e3a8b421c415e62289fe798aa6b2cdfb.jpg","type":0,"id":9710008,"ga_prefix":"040807","title":"在 IT 行业，拿 50~100 万年薪"},{"image":"https://pic2.zhimg.com/v2-6f80f0661d0baec17160ed07640f822d.jpg","type":0,"id":9709724,"ga_prefix":"040719","title":"「弟弟妹妹小，让给弟弟妹妹吧」真的能让孩子学会谦让吗？"},{"image":"https://pic3.zhimg.com/v2-5fd57c4d254029e9ea991be4eb7a9fd2.jpg","type":0,"id":9710014,"ga_prefix":"040716","title":"先是冲我打了一枪，然后还要开炮，人类也太凶残了吧"},{"image":"https://pic3.zhimg.com/v2-1857dba92a79f06d76c8164b78d8a5ea.jpg","type":0,"id":9709875,"ga_prefix":"040621","title":"改编不是乱编，游戏改编电影为什么总是那么烂？"},{"image":"https://pic3.zhimg.com/v2-87ad00b873ce0de4e4204961d6a72086.jpg","type":0,"id":9709914,"ga_prefix":"040519","title":"学心理学的人，是真会养孩子啊"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-bce58bcbb271e0b5b39282365393824b.jpg"]
         * type : 0
         * id : 9709943
         * ga_prefix : 040810
         * title : 贫血、停经、肠胃感染……吃素食真的会对身体有害吗？
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic4.zhimg.com/v2-e3a8b421c415e62289fe798aa6b2cdfb.jpg
         * type : 0
         * id : 9710008
         * ga_prefix : 040807
         * title : 在 IT 行业，拿 50~100 万年薪
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
