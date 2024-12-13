function getDetail(element) {
    const itemId = element.getAttribute('data-id');
    const itemName = element.getAttribute('data-name');

    console.log(`Clicked item: ID = ${itemId}, Name = ${itemName}`);
}

function toggleFolderVisibility(folderId) {
    var folder = document.getElementById(folderId);
    if (folder.style.display === "none") {
        folder.style.display = "block"; // Mở rộng
    } else {
        folder.style.display = "none"; // Thu gọn
    }
}