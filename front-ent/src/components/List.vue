<template>
  <div class="album py-3 bg-light">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <div class="card mb-4 shadow-sm">
            <svg
              class="bd-placeholder-img card-img-top"
              width="100%"
              height="225"
              xmlns="http://www.w3.org/2000/svg"
              preserveAspectRatio="xMidYMid slice"
              focusable="false"
              role="img"
              aria-label="Placeholder: Thumbnail"
            >
              <title>Placeholder</title>
              <rect width="100%" height="100%" fill="#55595c" />
              <text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text>
            </svg>
            <div class="card-body">
              <h4>San pham xxx</h4>
              <i>6.490.000₫</i>
              <b>1.490.000₫</b>
              <ul class="card-text">
                <li>Tặng PMH 500,000đ mua Airpods</li>
                <li>Tặng PMH 500,000đ mua Airpods</li>
              </ul>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group button">
                  <button type="button" class="btn btn-sm btn-outline-success">Add to cart</button>
                </div>
                <span class="text-muted">
                  <span class="badge badge-danger">Hot</span>
                </span>
              </div>
            </div>
          </div>
        </div>
        <nav aria-label="Page navigation example" class="col-12">
          <ul class="pagination justify-content-end">
            <li class="page-item">
              <a class="page-link" href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
              </a>
            </li>
            <li class="page-item">
              <a class="page-link" href="#">1</a>
            </li>
            <li class="page-item">
              <a class="page-link" href="#">2</a>
            </li>
            <li class="page-item">
              <a class="page-link" href="#">3</a>
            </li>
            <li class="page-item">
              <a class="page-link" href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
              </a>
            </li>
          </ul>
        </nav>
      </div>
    </div>
  </div>
  <!-- /.blog-post -->
</template>

<script>
export default {
  name: "List",
  props: {
    msg: String
  }
};
</script>