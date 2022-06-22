// Next.js API route support: https://nextjs.org/docs/api-routes/introduction

export default function handler(req, res) {
    const arr=[{name:"indigo"},{name:"spicjets"}]
    res.status(200).json({ flights: arr})
  }
  