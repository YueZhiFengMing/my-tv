package com.lizongying.mytv

import com.lizongying.mytv.models.ProgramType

object TVList {
    val list: Map<String, List<TV>> by lazy {
        setup()
    }

    private fun setup(): Map<String, List<TV>> {
        var list = mapOf(
            "央视" to listOf(
                TV(
                    0,
                    "CCTV1 综合",
                    "CCTV1",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000001000018602/index.m3u8?channel-id=ystenlive&Contentid=1000000001000018602&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/d57905b93540bd15f0c48230dbbbff7ee0d645ff539e38866e2d15c8b9f7dfcd.png?imageMogr2/format/webp",
                    "600001859",
                    "2022576801",
                    ProgramType.Y_PROTO,
                    false,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV2 财经",
                    "CCTV2",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031101/index.m3u8?channel-id=bestzb&Contentid=5000000011000031101&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/20115388de0207131af17eac86c33049b95d69eaff064e55653a1b941810a006.png?imageMogr2/format/webp",
                    "600001800",
                    "2022576701",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV3 综艺",
                    "CCTV3",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226021/index.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/7b7a65c712450da3deb6ca66fbacf4f9aee00d3f20bd80eafb5ada01ec63eb3a.png?imageMogr2/format/webp",
                    "600001801",
                    "2022576501",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = true
                ),
                TV(
                    0,
                    "CCTV4 中文国际",
                    "CCTV4",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031102/index.m3u8?channel-id=bestzb&Contentid=5000000011000031102&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/f357e58fdbcc076a3d65e1f958c942b2e14f14342c60736ceed98b092d35356a.png?imageMogr2/format/webp",
                    "600001814",
                    "2022576601",
                    ProgramType.Y_PROTO,
                    false,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV5 体育",
                    "CCTV5",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226019/index.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/0a6a7138952675983a3d854df7688557b286d59aa06166edae51506f9204d655.png?imageMogr2/format/webp",
                    "600001818",
                    "2022576401",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV6 电影",
                    "CCTV6",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226010/index.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/741515efda91f03f455df8a7da4ee11fa9329139c276435cf0a9e2af398d5bf2.png?imageMogr2/format/webp",
                    "600108442",
                    "2013693901",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = true
                ),
                TV(
                    0,
                    "CCTV7 国防军事",
                    "CCTV7",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031104/index.m3u8?channel-id=bestzb&Contentid=5000000011000031104&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/b29af94e295ebdf646cefb68122c429b9cd921f498ca20d2d8070252536f9ff9.png?imageMogr2/format/webp",
                    "600004092",
                    "2022576201",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV8 电视剧",
                    "CCTV8",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a0a:df::4031]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226008/index.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/ad51de94426a0ba039e6dd6a8534ea98ecc813a6176bde87b4f18cc34d6d7590.png?imageMogr2/format/webp",
                    "600001803",
                    "2022576101",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = true
                ),
                TV(
                    0,
                    "CCTV9 纪录",
                    "CCTV9",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:7008:20::8]:80/dbiptv.sn.chinamobile.com/PLTV/88888888/224/3221226197/1.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/2ed1b4deeca179d5db806bb941790f82eb92a1b7299c1c38fe027f95a5caee5e.png?imageMogr2/format/webp",
                    "600004078",
                    "2022576001",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV10 科教",
                    "CCTV10",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000012827/index.m3u8?channel-id=bestzb&Contentid=5000000004000012827&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/aa6157ec65188cd41826e5a2f088c3d6d153205f5f6428258d12c59999e221aa.png?imageMogr2/format/webp",
                    "600001805",
                    "2022573001",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV11 戏曲",
                    "CCTV11",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031106/index.m3u8?channel-id=bestzb&Contentid=5000000011000031106&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/ed12ed7c7a1034dae4350011fe039284c5d5a836506b28c9e32e3c75299625c0.png?imageMogr2/format/webp",
                    "600001806",
                    "2022575901",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV12 社会与法",
                    "CCTV12",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031107/index.m3u8?channel-id=bestzb&Contentid=5000000011000031107&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/484083cffaa40df7e659565e8cb4d1cc740158a185512114167aa21fa0c59240.png?imageMogr2/format/webp",
                    "600001807",
                    "2022575801",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV13 新闻",
                    "CCTV13",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031108/index.m3u8?channel-id=bestzb&Contentid=5000000011000031108&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/266da7b43c03e2312186b4a999e0f060e8f15b10d2cc2c9aa32171819254cf1a.png?imageMogr2/format/webp",
                    "600001811",
                    "2022575701",
                    ProgramType.Y_PROTO,
                    false,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV14 少儿",
                    "CCTV14",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000006673/index.m3u8?channel-id=bestzb&Contentid=5000000004000006673&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/af6b603896938dc346fbb16abfc63c12cba54b0ec9d18770a15d347d115f12d5.png?imageMogr2/format/webp",
                    "600001809",
                    "2022575601",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV15 音乐",
                    "CCTV15",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031109/index.m3u8?channel-id=bestzb&Contentid=5000000011000031109&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/2ceee92188ef684efe0d8b90839c4f3ad450d179dc64d59beff417059453af47.png?imageMogr2/format/webp",
                    "600001815",
                    "2022575501",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV16 奥林匹克",
                    "CCTV16-HD",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226100/index.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/53793fa7bacd3a93ff6dc5d2758418985e1f952a316c335d663b572d8bdcd74d.png?imageMogr2/format/webp",
                    "600098637",
                    "2022575401",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV17 农业农村",
                    "CCTV17",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000005000056836/index.m3u8?channel-id=ystenlive&Contentid=1000000005000056836&livemode=1&stbId=3")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/ddef563072f8bad2bea5b9e52674cb7b4ed50efb20c26e61994dfbdf05c1e3c0.png?imageMogr2/format/webp",
                    "600001810",
                    "2022575301",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CCTV5+ 体育赛事",
                    "CCTV5+",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:7008:20::8]:80/dbiptv.sn.chinamobile.com/PLTV/88888888/224/3221225761/1.m3u8")
                    },
                    "央视",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/649ad76a90bfef55b05db9fe52e006487280f619089099d5dc971e387fc6eff0.png?imageMogr2/format/webp",
                    "600001817",
                    "2022576301",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
//                TV(
//                    0,
//                    "CCTV4K 超高清",
//                    "CCTV4K",
//                    mutableListOf<String>().apply {
//                        add("http://[2409:8087:5e08:24::17]:6610/000000001000/5000000008000023254/index.m3u8?channel-id=bestzb&Contentid=5000000008000023254&livemode=1&stbId=3")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/3e9d06fd7244d950df5838750f1c6ac3456e172b51caca2c16d2282125b111e8.png?imageMogr2/format/webp",
//                    "600002264",
//                    "2022575201",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "CCTV8K 超高清",
//                    "CCTV8K",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    R.drawable.cctv8k,
//                    "600156816",
//                    "2020603421",
//                    ProgramType.Y_JCE,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "风云剧场",
//                    "CCTV风云剧场频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/4d549e53e6d0f632d5a633d1945280797b153e588f919221a07faa869812cc89.png?imageMogr2/format/webp",
//                    "600099658",
//                    "2012513603",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "第一剧场",
//                    "CCTV第一剧场频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/a556bd7d93ce65e18f243a8892b5604f4faa994a4897315914216a710a706208.png?imageMogr2/format/webp",
//                    "600099655",
//                    "2012514403",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "怀旧剧场",
//                    "CCTV怀旧剧场频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/5661bd04fecdb6e899f801147a22ab5d3a475bf2b62e30aec2c0023190ebc9b1.png?imageMogr2/format/webp",
//                    "600099620",
//                    "2012511203",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "世界地理",
//                    "CCTV世界地理频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/bb3c6c9e145d698137f5bb64a582021a01b51344b929003630eb769ea65832a9.png?imageMogr2/format/webp",
//                    "600099637",
//                    "2012513303",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "风云音乐",
//                    "CCTV风云音乐频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/bbf1d024c5228b8dd128b0e3cb1717d173fab4ee84c3a4c8a57b1a215362ca3b.png?imageMogr2/format/webp",
//                    "600099660",
//                    "2012514103",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "兵器科技",
//                    "CCTV兵器科技频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/4c6b6a6d3839889f34d33db3c2f80233b26b74d3489b393487635f8704e70796.png?imageMogr2/format/webp",
//                    "600099649",
//                    "2012513403",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "风云足球",
//                    "CCTV风云足球频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/cd1e2bb52b06a991de168733e5ff0f1d85adc8042d40c8f393f723543e5dd08a.png?imageMogr2/format/webp",
//                    "600099636",
//                    "2012514203",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "高尔夫网球",
//                    "CCTV高尔夫·网球频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/cdd1b31ede7a5ad049ed53d9a072422f829e72dd062ed2c19e077fdd01699071.png?imageMogr2/format/webp",
//                    "600099659",
//                    "2012512503",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "女性时尚",
//                    "CCTV女性时尚频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/fa28955ce8b2539d728bf4c6a13a46ff57ad76eae46627f7bcfb1ed8a613d3fc.png?imageMogr2/format/webp",
//                    "600099650",
//                    "2012513903",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "央视文化精品",
//                    "CCTV央视文化精品频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/14ac5ce40482cacd3d4b37435222bfe86af2b452a2f04ecbfc1d13d76edd7c57.png?imageMogr2/format/webp",
//                    "600099653",
//                    "2012513803",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "央视台球",
//                    "CCTV央视台球频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/10e14a92478011aa6c3c8562e62127f3b1908e29fcd78e4b2b24b9e6d3ec2fbc.png?imageMogr2/format/webp",
//                    "600099652",
//                    "2012513703",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "电视指南",
//                    "CCTV电视指南频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/244d72c0eb1615ed7d51c2f5db5a67f306aa3f58c05bc2d34de3aa7e956dc8c9.png?imageMogr2/format/webp",
//                    "600099656",
//                    "2012514003",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
//                TV(
//                    0,
//                    "卫生健康",
//                    "CCTV卫生健康频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "央视",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/54a6863656fdfd8f803be193ddf22441c5000a108833889816fd2d8911715ce8.png?imageMogr2/format/webp",
//                    "600099651",
//                    "2012513503",
//                    ProgramType.Y_PROTO,
//                    true,
//                    mustToken = true
//                ),
            ),
            "地方" to listOf(
                TV(
                    0,
                    "东方卫视",
                    "东方卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226345/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/9bd372ca292a82ce3aa08772b07efc4af1f85c21d1f268ea33440c49e9a0a488.png?imageMogr2/format/webp",
                    "600002483",
                    "2000292403",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "湖南卫视",
                    "湖南卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a0a:df::4031]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226307/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/4120e89d3079d08aa17d382f69a2308ec70839b278367763c34a34666c75cb88.png?imageMogr2/format/webp",
                    "600002475",
                    "2000296203",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "湖北卫视",
                    "湖北卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a0a:df::4016]:80/wh7f454c46tw2482810079_2015670374/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221225627/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/7a6be5a2bb1dc53a945c016ff1f525dc4a84c51db371c15c89aa55404b0ba784.png?imageMogr2/format/webp",
                    "600002508",
                    "2000294503",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "辽宁卫视",
                    "辽宁卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000011671/index.m3u8?channel-id=bestzb&Contentid=5000000004000011671&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/ac4ed6058a87c101ae7147ebc38905d0cae047fb73fd277ee5049b84f52bda36.png?imageMogr2/format/webp",
                    "600002505",
                    "2000281303",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "江苏卫视",
                    "江苏卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e00:24::1e]:6060/200000001898/460000089800010225/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/380ad685c0c1d5b2c902246b8d2df6d3f9b45e2837abcfe493075bbded597a31.png?imageMogr2/format/webp",
                    "600002521",
                    "2000295603",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "江西卫视",
                    "江西卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000011210/index.m3u8?channel-id=bestzb&Contentid=5000000004000011210&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/3c760d0d00463855890e8a1864ea4a6b6dd66b90c29b4ac714a4b17c16519871.png?imageMogr2/format/webp",
                    "600002503",
                    "2000294103",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "山东卫视",
                    "山东卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a0a:df::404b]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226456/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/22d403f07a7cf5410b3ad3ddb65a11aa229a32475fac213f5344c9f0ec330ca1.png?imageMogr2/format/webp",
                    "600002513",
                    "2000294803",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "广东卫视",
                    "广东卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/yinhe/88888888/224/3221226248/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/28886880a4dc0f06fb7e0a528a1def0591d61a65870e29176ede0cc92033bbfd.png?imageMogr2/format/webp",
                    "600002485",
                    "2000292703",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "广西卫视",
                    "广西卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000011000031118/index.m3u8?channel-id=bestzb&Contentid=5000000011000031118&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/54b7e97cb816bb223fe05f3fc44da2c7820eb66e8550c19d23100f2c414ecc38.png?imageMogr2/format/webp",
                    "600002509",
                    "2000294203",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "重庆卫视",
                    "重庆卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000025797/index.m3u8?channel-id=bestzb&Contentid=5000000004000025797&livemode=1&stbId=3")
                    },
                    "地方",
                    R.drawable.chongqing,
                    "600002531",
                    "2000297803",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "河南卫视",
                    "河南卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/TVOD/88888888/224/3221226480/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/74925962148a6d31c85808b6cd4e444c2a54bab393d2c5fc85e960b50e22fa86.png?imageMogr2/format/webp",
                    "600002525",
                    "2000296103",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "河北卫视",
                    "河北卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000006000040016/index.m3u8?channel-id=bestzb&Contentid=5000000006000040016&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/d545becdc81c60197b08c7f47380705e4665ed3fe55efc8b855e486f6e655378.png?imageMogr2/format/webp",
                    "600002493",
                    "2000293403",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "贵州卫视",
                    "贵州卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000002000003169/index.m3u8?livemode=1&stbId=10&channel-id=ystenlive&Contentid=1000000002000003169")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/4eb45f4781d33d872af027dc01c941559aab55667dd99cc5c22bef7037807b13.png?imageMogr2/format/webp",
                    "600002490",
                    "2000293303",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "北京卫视",
                    "北京卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000031556/index.m3u8?channel-id=bestzb&Contentid=5000000004000031556&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/f4f23633c578beea49a3841d88d3490100f029ee349059fa532869db889872c5.png?imageMogr2/format/webp",
                    "600002309",
                    "2000272103",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "黑龙江卫视",
                    "黑龙江卫视",
                    mutableListOf<String>().apply {
                        add("https://livestream-bt.nmtv.cn/nmtv/2314general.m3u8?txSecret=35f2dd39972cede5222c6bd2c0efe24b&txTime=77395680")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/d8273ae9be698ce2db21f5b886ecac95a73429593f93713c60ed8c12c38bf0d3.png?imageMogr2/format/webp",
                    "600002498",
                    "2000293903",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "浙江卫视",
                    "浙江卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a01:df::7005]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226339/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/a66c836bd98ba3e41a2e9a570d4b9c50dedc6839e9de333e2e78212ad505f37e.png?imageMogr2/format/webp",
                    "600002520",
                    "2000295503",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "安徽卫视",
                    "安徽卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000023002/index.m3u8?channel-id=bestzb&Contentid=5000000004000023002&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/f35fa04b51b1ee4984b03578b65403570868ebca03c6c01e11b097f999a58d9b.png?imageMogr2/format/webp",
                    "600002532",
                    "2000298003",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "深圳卫视",
                    "深圳卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:1a0a:df::404b]:80/ottrrs.hl.chinamobile.com/PLTV/88888888/224/3221226313/index.m3u8")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/d59fec04c902e3581c617136d02d4b9b8c4cbe64272781ddd3525e80c823edb7.png?imageMogr2/format/webp",
                    "600002481",
                    "2000292203",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "四川卫视",
                    "四川卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000002000016825/index.m3u8?channel-id=ystenlive&Contentid=1000000002000016825&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/3276a414ae0eaa0f116f2045cd913367967d0c7c1e978e8621ac3879436c6ed7.png?imageMogr2/format/webp",
                    "600002516",
                    "2000295003",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "东南卫视",
                    "福建东南卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000002000009263/index.m3u8?livemode=1&stbId=3&channel-id=ystenlive&Contentid=1000000002000009263")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/3208fe6564a293c21b711333fb3edb05bb5b406cff840573c9a8d839680a1579.png?imageMogr2/format/webp",
                    "600002484",
                    "2000292503",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "海南卫视",
                    "海南卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000006211/index.m3u8?channel-id=bestzb&Contentid=5000000004000006211&livemode=1&stbId=3")
                    },
                    "地方",
                    "https://resources.yangshipin.cn/assets/oms/image/202306/6e060391fde0469801fc3d84dbf204b4f8d650d251f17d7595a6964c0bb99e81.png?imageMogr2/format/webp",
                    "600002506",
                    "2000291503",
                    ProgramType.Y_PROTO,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "天津卫视",
                    "天津卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000004000006827/index.m3u8?channel-id=bestzb&Contentid=5000000004000006827&livemode=1&stbId=3")
                    },
                    "地方",
                    R.drawable.tianjin,
                    "600152137",
                    "2019927003",
                    ProgramType.Y_JCE,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "新疆卫视",
                    "新疆卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000002000029441/index.m3u8?livemode=1&stbId=10&channel-id=ystenlive&Contentid=1000000002000029441")
                    },
                    "地方",
                    R.drawable.xinjiang,
                    "600152138",
                    "2019927403",
                    ProgramType.Y_JCE,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "兵团卫视",
                    "兵团卫视",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/1000000005000266005/index.m3u8?livemode=1&stbId=10&channel-id=ystenlive&Contentid=1000000005000266005")
                    },
                    "地方",
                    R.drawable.bingtuan,
                    "600170344",
                    "2022606701",
                    ProgramType.Y_JCE,
                    true,
                    mustToken = false
                ),
                TV(
                    0,
                    "CETV1",
                    "CETV1",
                    mutableListOf<String>().apply {
                        add("http://[2409:8087:5e08:24::2]:6610/000000001000/5000000002000002652/index.m3u8?channel-id=bestzb&Contentid=5000000002000002652&livemode=1&stbId=3")
                    },
                    "地方",
                    R.drawable.cetv1,
                    "600171827",
                    "2022823801",
                    ProgramType.Y_JCE,
                    true,
                    mustToken = false
                ),
            ),
//            "港澳台" to listOf(
//                TV(
//                    0,
//                    "凤凰卫视资讯台",
//                    "",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "港澳台",
//                    "http://c1.fengshows-cdn.com/a/2021_22/79dcc3a9da358a3.png",
//                    "7c96b084-60e1-40a9-89c5-682b994fb680",
//                    "",
//                    ProgramType.F,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "凤凰卫视中文台",
//                    "",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "港澳台",
//                    "http://c1.fengshows-cdn.com/a/2021_22/ede3d9e09be28e5.png",
//                    "f7f48462-9b13-485b-8101-7b54716411ec",
//                    "",
//                    ProgramType.F,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "凤凰卫视香港台",
//                    "",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "港澳台",
//                    "http://c1.fengshows-cdn.com/a/2021_23/325d941090bee17.png",
//                    "15e02d92-1698-416c-af2f-3e9a872b4d78",
//                    "",
//                    ProgramType.F,
//                    false,
//                    mustToken = false
//                ),
//            ),
//            "国际" to listOf(
//                TV(
//                    0,
//                    "CGTN",
//                    "CGTN",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "国际",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/a72dff758ca1c17cd0ecc8cedc11b893d208f409d5e6302faa0e9d298848abc3.png?imageMogr2/format/webp",
//                    "600014550",
//                    "2022575001",
//                    ProgramType.Y_PROTO,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "CGTN 法语频道",
//                    "CGTN法语频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "国际",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/a8d0046a47433d952bf6ed17062deb8bd2184ba9aec0f7781df6bf9487a3ffcf.png?imageMogr2/format/webp",
//                    "600084704",
//                    "2022574901",
//                    ProgramType.Y_PROTO,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "CGTN 俄语频道",
//                    "CGTN俄语频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "国际",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/bf0a820893cbaf20dd0333e27042e1ef9c8806e5b602b6a8c95af399db0bc77a.png?imageMogr2/format/webp",
//                    "600084758",
//                    "2022574801",
//                    ProgramType.Y_PROTO,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "CGTN 阿拉伯语频道",
//                    "CGTN阿拉伯语频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "国际",
//                    "https://resources.yangshipin.cn/assets/oms/image/202306/2e44e2aa3e7a1cedf07fd0ae59fe69e86a60a2632660a006e3e9e7397b2d107e.png?imageMogr2/format/webp",
//                    "600084782",
//                    "2022574601",
//                    ProgramType.Y_PROTO,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "CGTN 西班牙语频道",
//                    "CGTN西班牙语频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "国际",
//                    "https://resources.yangshipin.cn/assets/oms/image/202309/7c337e3dbe64402ec7e4678a619a4a6d95144e42f35161181ff78e143b7cf67a.png?imageMogr2/format/webp",
//                    "600084744",
//                    "2022571701",
//                    ProgramType.Y_PROTO,
//                    false,
//                    mustToken = false
//                ),
//                TV(
//                    0,
//                    "CGTN 纪录频道",
//                    "CGTN外语纪录频道",
//                    mutableListOf<String>().apply {
//                        add("")
//                    },
//                    "国际",
//                    "https://resources.yangshipin.cn/assets/oms/image/202309/74d3ac436a7e374879578de1d87a941fbf566d39d5632b027c5097891ed32bd5.png?imageMogr2/format/webp",
//                    "600084781",
//                    "2022574701",
//                    ProgramType.Y_PROTO,
//                    false,
//                    mustToken = false
//                ),
//            )
        )

        val listNew = mutableMapOf<String, List<TV>>()
        var id = 0
        list.forEach { (k, v) ->
            val group = mutableListOf<TV>()
            v.forEach { v1 ->
                v1.id = id
                id++
                group.add(v1)
            }
            if (group.size > 0) {
                listNew[k] = group
            }
        }
        return listNew
    }
}