function getPhotos(photosData) {
    for (var i in photosData) {
        var elem = $("<img>");
        elem.attr("src", photosData[i].filename);
        $("#photos").append(elem);
    }
}

function getUser(userData) {
    if (userData.length == 0) {
        $("#login").show();
    }
    else {
        $("#logout").show(); // i guess?? should display logout button
        $("#upload").show();
        $.get("/photos", getPhotos);
    }
}

$.get("/user", getUser);