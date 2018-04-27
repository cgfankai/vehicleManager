$(document).ready(function () {
    $("input").on('click', function () {
        var jqObj = $(this);
        var idStr = jqObj.attr("id")
        if (idStr == "interface-1") {
            var args_1 = $("#interface-1-1").val();
            var args_2 = $("#interface-1-2").val();
            $.ajax({
                url: 'vehicle/api/procLoadPcdByRq',
                method: 'post',
                data: {
                    args_1: args_1,
                    args_2: args_2
                },
                success: function (data) {
                    console.info("派车单列表读取", data)
                }
            })
        }
        if (idStr == "interface-2") {
            var args_1 = $("#interface-2-1").val();
            $.ajax({
                url: 'vehicle/api/procLoadTaskByPcd',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("派车单任务读取", data)
                }
            })
        }
        if (idStr == "interface-3") {
            $.ajax({
                url: 'vehicle/api/procGetMaxPcdh',
                method: 'post',
                success: function (data) {
                    console.info("获得新派车单号", data)
                }
            })
        }
        if (idStr == "interface-4") {
            $.ajax({
                url: 'vehicle/api/procLoadCx',
                method: 'post',
                success: function (data) {
                    console.info("获得车型列表", data)
                }
            })
        }
        if (idStr == "interface-5") {
            var args_1 = $("#interface-5-1").val();
            var args_2 = $("#interface-5-2").val();
            $.ajax({
                url: 'vehicle/api/procLoadChByCx',
                method: 'post',
                data: {
                    args_1: args_1,
                    args_2: args_2
                },
                success: function (data) {
                    console.info("获得车号", data)
                }
            })
        }
        if (idStr == "interface-6") {
            var args_1 = $("#interface-6-1").val();
            $.ajax({
                url: 'vehicle/api/procLoadQSBByJD',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("根据用车单位、报到地点、用车人获取信息", data)
                }
            })
        }
        if (idStr == "interface-7") {
            var PCDH = $("#interface-7-1").val();
            var PCDATE = $("#interface-7-2").val();
            var CH = $("#interface-7-3").val();
            var CX = $("#interface-7-4").val();
            var CARSJID = $("#interface-7-5").val();
            var CARSJXM = $("#interface-7-6").val();
            var BDSJ = $("#interface-7-7").val();
            var ISWC = 0;
            var SM = $("#interface-7-15").val();
            var PCRID = $("#interface-7-18").val();
            var PCRXM = $("#interface-7-19").val();
            $.ajax({
                url: 'vehicle/api/procInsertPcd',
                method: 'post',
                data: {
                    PCDH: PCDH,
                    PCDATE: PCDATE,
                    CH: CH,
                    CX: CX,
                    CARSJID: CARSJID,
                    CARSJXM: CARSJXM,
                    BDSJ: BDSJ,
                    ISWC: ISWC,
                    SM: SM,
                    PCRID: PCRID,
                    PCRXM: PCRXM
                },
                success: function (data) {
                    console.info("新增派车单", data)
                }
            })
        }
        if (idStr == "interface-8") {
            var PCDH = $("#interface-8-1").val();
            var YCDW = $("#interface-8-2").val();
            var YCR = $("#interface-8-3").val();
            var DH = $("#interface-8-4").val();
            var KSSJ = $("#interface-8-5").val();
            var JSSJ = $("#interface-8-6").val();
            var BDDD = $("#interface-8-7").val();
            var TASK = $("#interface-8-8").val();
            var LB = $("#interface-8-9").val();
            $.ajax({
                url: 'vehicle/api/procInsertTask',
                method: 'post',
                data: {
                    PCDH: PCDH,
                    YCDW: YCDW,
                    YCR: YCR,
                    DH: DH,
                    KSSJ: KSSJ,
                    JSSJ: JSSJ,
                    BDDD: BDDD,
                    TASK: TASK,
                    LB: LB
                },
                success: function (data) {
                    console.info("新增派车单任务", data)
                }
            })
        }

        if (idStr == "interface-9") {
            var PCDH = $("#interface-9-1").val();
            var PCDATE = $("#interface-9-2").val();
            var CH = $("#interface-9-3").val();
            var CX = $("#interface-9-4").val();
            var CARSJID = $("#interface-9-5").val();
            var CARSJXM = $("#interface-9-6").val();
            var BDSJ = $("#interface-9-7").val();
            var SM = $("#interface-9-15").val();
            $.ajax({
                url: 'vehicle/api/procUpdatePcd',
                method: 'post',
                data: {
                    PCDH: PCDH,
                    PCDATE: PCDATE,
                    CH: CH,
                    CX: CX,
                    CARSJID: CARSJID,
                    CARSJXM: CARSJXM,
                    BDSJ: BDSJ,
                    SM: SM
                },
                success: function (data) {
                    console.info("更新派车单", data)
                }
            })
        }

        if (idStr == "interface-10") {
            var PCDH = $("#interface-10-1").val();
            var YCDW = $("#interface-10-2").val();
            var YCR = $("#interface-10-3").val();
            var DH = $("#interface-10-4").val();
            var KSSJ = $("#interface-10-5").val();
            var JSSJ = $("#interface-10-6").val();
            var BDDD = $("#interface-10-7").val();
            var TASK = $("#interface-10-8").val();
            var LB = $("#interface-10-10").val();
            var ID = $("#interface-10-9").val();
            $.ajax({
                url: 'vehicle/api/procUpdateTask',
                method: 'post',
                data: {
                    PCDH: PCDH,
                    YCDW: YCDW,
                    YCR: YCR,
                    DH: DH,
                    KSSJ: KSSJ,
                    JSSJ: JSSJ,
                    BDDD: BDDD,
                    TASK: TASK,
                    ID: ID,
                    LB: LB
                },
                success: function (data) {
                    console.info("更新派车单任务", data)
                }
            })
        }
        if (idStr == "interface-11") {
            var args_1 = $("#interface-11-1").val();
            $.ajax({
                url: 'vehicle/api/procDeleteTask',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("删除派车单下任务", data)
                }
            })
        }
        if (idStr == "interface-12") {
            var args_1 = $("#interface-12-1").val();
            $.ajax({
                url: 'vehicle/api/procDeletePch',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("删除派车单 ", data)
                }
            })
        }
        if (idStr == "interface-13") {
            var args_1 = $("#interface-13-1").val();
            $.ajax({
                url: 'vehicle/api/procLoadPcd',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("查询未完成的派车单", data)
                }
            })
        }
        if (idStr == "interface-14") {
            var args_1 = $("#interface-14-1").val();
            var args_2 = $("#interface-14-2").val();
            var args_3 = $("#interface-14-3").val();
            var args_4 = $("#interface-14-4").val();
            $.ajax({
                url: 'vehicle/api/procUpdatePcdWcqk',
                method: 'post',
                data: {
                    args_1: args_1,
                    args_2: args_2,
                    args_3: args_3,
                    args_4: args_4,
                },
                success: function (data) {
                    console.info("结束派车单", data)
                }
            })
        }

        if (idStr == "interface-15") {
            var args_1 = $("#interface-15-1").val();
            $.ajax({
                url: 'vehicle/api/isDistributeMember',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("是否派车人", data)
                }
            })
        }
        if (idStr == "interface-16") {
            var args_1 = $("#interface-16-1").val();
            $.ajax({
                url: 'vehicle/api/isDriver',
                method: 'post',
                data: {
                    args_1: args_1,
                },
                success: function (data) {
                    console.info("是否司机", data)
                }
            })
        }


    })
})
